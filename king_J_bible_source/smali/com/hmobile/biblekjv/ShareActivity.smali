.class public Lcom/hmobile/biblekjv/ShareActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "ShareActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;


# instance fields
.field private BookName:Ljava/lang/String;

.field private ShareText:Ljava/lang/String;

.field private edtSharetext:Landroid/widget/EditText;

.field private facebook:Lcom/facebook/android/Facebook;

.field private imgFacebook:Landroid/widget/ImageView;

.field private imgShare:Landroid/widget/ImageView;

.field private imgTwitter:Landroid/widget/ImageView;

.field private mAsyncRunner:Lcom/facebook/android/AsyncFacebookRunner;

.field private txtContent:Landroid/widget/TextView;

.field private txtContentLink:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/ShareActivity;->BookName:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public Failed()V
    .locals 0

    .prologue
    .line 229
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->hideProgress()V

    .line 231
    return-void
.end method

.method public SuccessFully()V
    .locals 4

    .prologue
    .line 220
    iget-object v2, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    invoke-static {v2}, Lcom/hmobile/model/VerseInfo;->getVerseInfoByVerse(Ljava/lang/String;)Lcom/hmobile/model/VerseInfo;

    move-result-object v0

    .line 221
    .local v0, "info":Lcom/hmobile/model/VerseInfo;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .local v1, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iget v2, v0, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    iget v2, v0, Lcom/hmobile/model/VerseInfo;->BookId:I

    iget v3, v0, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/hmobile/biblekjv/ShareActivity;->PostShare(Ljava/util/ArrayList;II)V

    .line 224
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->hideProgress()V

    .line 225
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->finish()V

    .line 216
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v9, 0x1

    .line 90
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgFacebook:Landroid/widget/ImageView;

    if-ne p1, v7, :cond_1

    .line 101
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->BookName:Ljava/lang/String;

    iget-object v8, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    invoke-virtual {p0, v7, v8, v9}, Lcom/hmobile/biblekjv/ShareActivity;->signInWithFb(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 211
    :cond_0
    :goto_0
    return-void

    .line 147
    :cond_1
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgTwitter:Landroid/widget/ImageView;

    if-ne p1, v7, :cond_4

    .line 148
    new-instance v7, Ljava/lang/StringBuilder;

    iget-object v8, p0, Lcom/hmobile/biblekjv/ShareActivity;->edtSharetext:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, " \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 149
    iget-object v8, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContent:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 150
    iget-object v8, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 148
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 151
    .local v4, "sharetext":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v9, :cond_3

    .line 152
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x8c

    if-le v7, v8, :cond_2

    .line 153
    invoke-virtual {p0, v4, p0}, Lcom/hmobile/biblekjv/ShareActivity;->showAlertForTwitterShare(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {p0, v4, p0}, Lcom/hmobile/biblekjv/ShareActivity;->signInwithTwitter(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    goto :goto_0

    .line 166
    :cond_3
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    .line 167
    const-string v8, "Please insert some text to share"

    .line 166
    invoke-static {v7, v8, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    .line 168
    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 170
    .end local v4    # "sharetext":Ljava/lang/String;
    :cond_4
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgShare:Landroid/widget/ImageView;

    if-ne p1, v7, :cond_6

    .line 171
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->edtSharetext:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-interface {v7}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v4

    .line 172
    .restart local v4    # "sharetext":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_5

    .line 173
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    .line 174
    const-string v8, "Please insert some text to share"

    .line 173
    invoke-static {v7, v8, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    .line 175
    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 177
    :cond_5
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 178
    const v8, 0x7f070084

    .line 177
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 180
    .local v2, "link":Ljava/lang/String;
    new-instance v5, Landroid/content/Intent;

    const-string v7, "android.intent.action.SEND"

    invoke-direct {v5, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 181
    .local v5, "sharingIntent":Landroid/content/Intent;
    const-string v7, "text/plain"

    invoke-virtual {v5, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    const-string v7, "android.intent.extra.SUBJECT"

    .line 184
    const v8, 0x7f070086

    invoke-virtual {p0, v8}, Lcom/hmobile/biblekjv/ShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 183
    invoke-virtual {v5, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 186
    const-string v7, "android.intent.extra.TEXT"

    .line 187
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " \n"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v9, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContent:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 188
    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 187
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 186
    invoke-virtual {v5, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 191
    const-string v7, "Share using"

    invoke-static {v5, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v7

    .line 190
    invoke-virtual {p0, v7}, Lcom/hmobile/biblekjv/ShareActivity;->startActivity(Landroid/content/Intent;)V

    .line 200
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    invoke-static {v7}, Lcom/hmobile/model/VerseInfo;->getVerseInfoByVerse(Ljava/lang/String;)Lcom/hmobile/model/VerseInfo;

    move-result-object v1

    .line 201
    .local v1, "info":Lcom/hmobile/model/VerseInfo;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iget v7, v1, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    iget v7, v1, Lcom/hmobile/model/VerseInfo;->BookId:I

    iget v8, v1, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    invoke-virtual {p0, v3, v7, v8}, Lcom/hmobile/biblekjv/ShareActivity;->PostShare(Ljava/util/ArrayList;II)V

    goto/16 :goto_0

    .line 205
    .end local v1    # "info":Lcom/hmobile/model/VerseInfo;
    .end local v2    # "link":Ljava/lang/String;
    .end local v3    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .end local v4    # "sharetext":Ljava/lang/String;
    .end local v5    # "sharingIntent":Landroid/content/Intent;
    :cond_6
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 206
    iget-object v7, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    .line 207
    .local v6, "url":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 208
    .local v0, "i":Landroid/content/Intent;
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 209
    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/ShareActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x1

    .line 39
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    const v1, 0x7f03002f

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->setContentView(I)V

    .line 41
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 42
    .local v0, "b":Landroid/os/Bundle;
    if-eqz v0, :cond_1

    .line 43
    const-string v1, "SHARETEXT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 44
    const-string v1, "SHARETEXT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    .line 46
    :cond_0
    const-string v1, "book"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 47
    const-string v1, "book"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->BookName:Ljava/lang/String;

    .line 50
    :cond_1
    const v1, 0x7f0e009d

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->edtSharetext:Landroid/widget/EditText;

    .line 51
    const v1, 0x7f0e0050

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContent:Landroid/widget/TextView;

    .line 52
    const v1, 0x7f0e0121

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    .line 53
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_2

    .line 54
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->edtSharetext:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/hmobile/biblekjv/ShareActivity;->ShareText:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :cond_2
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->BookName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_3

    .line 57
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContent:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/hmobile/biblekjv/ShareActivity;->BookName:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ". "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    .line 59
    const v2, 0x7f070084

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/ShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->underlineText(Landroid/widget/TextView;)V

    .line 62
    :cond_3
    const v1, 0x7f0e003b

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgFacebook:Landroid/widget/ImageView;

    .line 63
    const v1, 0x7f0e003d

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgTwitter:Landroid/widget/ImageView;

    .line 64
    const v1, 0x7f0e003f

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgShare:Landroid/widget/ImageView;

    .line 65
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgFacebook:Landroid/widget/ImageView;

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgTwitter:Landroid/widget/ImageView;

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->imgShare:Landroid/widget/ImageView;

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    iget-object v1, p0, Lcom/hmobile/biblekjv/ShareActivity;->txtContentLink:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    sget-boolean v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v1, :cond_4

    .line 70
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->addAdView()V

    .line 75
    :goto_0
    return-void

    .line 72
    :cond_4
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ShareActivity;->hideAdView()V

    goto :goto_0
.end method

.method public underlineText(Landroid/widget/TextView;)V
    .locals 5
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 79
    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 81
    .local v0, "content":Landroid/text/SpannableString;
    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 82
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .end local v0    # "content":Landroid/text/SpannableString;
    :goto_0
    return-void

    .line 83
    :catch_0
    move-exception v1

    goto :goto_0
.end method
