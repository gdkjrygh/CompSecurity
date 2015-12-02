.class public Lcom/qihoo/security/ui/antivirus/list/c;
.super Lcom/qihoo/security/opti/trashclear/ui/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/list/c$2;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/opti/trashclear/ui/a",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lcom/qihoo/security/locale/d;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 47
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/c;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private a(Landroid/view/View;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 395
    const v0, 0x7f0b022b

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 396
    const v1, 0x7f0b022c

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 397
    iget v2, p2, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    packed-switch v2, :pswitch_data_0

    .line 417
    :goto_0
    return-void

    .line 399
    :pswitch_0
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 400
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 403
    :pswitch_1
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 404
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 407
    :pswitch_2
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 408
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 411
    :pswitch_3
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 412
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 397
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 453
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 454
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 455
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 456
    iput p2, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 457
    invoke-direct {p0, v0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto :goto_0

    .line 459
    :cond_0
    return-void
.end method

.method private c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v9, 0x7f0c0141

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 104
    const v0, 0x7f0b0049

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 105
    const v1, 0x7f0b004a

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 106
    const v2, 0x7f0b0142

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 108
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 110
    iget v4, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    packed-switch v4, :pswitch_data_0

    .line 123
    :goto_0
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/c$2;->a:[I

    iget-object v4, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v4}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v4

    aget v0, v0, v4

    packed-switch v0, :pswitch_data_1

    .line 158
    :cond_0
    :goto_1
    iget v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;I)V

    .line 160
    iget v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-ne v8, v0, :cond_1

    .line 161
    iput v7, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    .line 170
    :goto_2
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 171
    return-void

    .line 112
    :pswitch_1
    const v4, 0x7f0200b5

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 115
    :pswitch_2
    const v4, 0x7f0200b4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 125
    :pswitch_3
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->d:I

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00f9

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 128
    const v0, 0x7f0c0140

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 131
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00fb

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 133
    const v0, 0x7f0c0142

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_1

    .line 136
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00fd

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 138
    const v0, 0x7f0c0143

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_1

    .line 141
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00fc

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 143
    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_1

    .line 146
    :pswitch_7
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 148
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 149
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/list/c;->c:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c00fa

    invoke-virtual {v5, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string/jumbo v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_1

    .line 163
    :cond_1
    invoke-virtual {p0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/c;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 164
    iput v8, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    goto/16 :goto_2

    .line 166
    :cond_2
    const/4 v0, 0x2

    iput v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    goto/16 :goto_2

    .line 110
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 123
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 180
    const v0, 0x7f0b022d

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;

    .line 181
    const v1, 0x7f0b004a

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 182
    const v2, 0x7f0b0142

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 184
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 185
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->setFolderImageView(Ljava/util/List;)V

    .line 186
    const v0, 0x7f0c0144

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 187
    const v0, 0x7f0c0145

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 189
    const v0, 0x7f0b022e

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 190
    const/4 v1, 0x2

    iget v2, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-ne v1, v2, :cond_0

    .line 191
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 200
    :goto_0
    iget v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;I)V

    .line 202
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->i(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 204
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 206
    invoke-direct {p0, p1, v3}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 207
    return-void

    .line 193
    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    goto :goto_0
.end method

.method private e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v10, 0x7f080070

    const v9, 0x7f020044

    const/16 v8, 0x8

    const/4 v7, 0x2

    .line 216
    const v0, 0x7f0b0049

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 217
    const v1, 0x7f0b004a

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 218
    const v2, 0x7f0b0229

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 219
    const v3, 0x7f0b0142

    invoke-static {p1, v3}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 221
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 223
    sget-object v5, Lcom/qihoo/security/ui/antivirus/list/c$2;->a:[I

    iget-object v6, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v6}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 277
    :goto_0
    iget v0, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;I)V

    .line 279
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->i(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 281
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 283
    invoke-direct {p0, p1, v4}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 284
    return-void

    .line 227
    :pswitch_0
    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    iget-object v6, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v5, v6}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 228
    iget-object v5, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v5, v9}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    .line 233
    :goto_1
    iget-object v0, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTag(Ljava/lang/Object;)V

    .line 234
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v0

    new-instance v5, Lcom/qihoo/security/ui/antivirus/list/c$1;

    invoke-direct {v5, p0, v1, v4}, Lcom/qihoo/security/ui/antivirus/list/c$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/c;Lcom/qihoo/security/locale/widget/LocaleTextView;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    const-string/jumbo v1, "appLabel"

    iget-object v6, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v7, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    invoke-virtual {v4, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getDisplaySubTitle(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 250
    iget-boolean v1, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v1, :cond_1

    .line 251
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    const v5, 0x7f0c00e6

    invoke-static {v1, v5, v10, v0}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 256
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    invoke-virtual {v4, v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getDescription(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 257
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setMaxLines(I)V

    goto :goto_0

    .line 230
    :cond_0
    iget-object v5, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v5, v9}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c(Ljava/lang/String;I)V

    goto :goto_1

    .line 254
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    invoke-static {v1, v0, v10}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 260
    :pswitch_1
    iget-object v5, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    invoke-virtual {v5}, Lcom/qihoo/security/leak/c;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 261
    iget-object v0, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 262
    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 263
    iget-object v0, v4, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 264
    invoke-virtual {v3, v7}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setMaxLines(I)V

    goto/16 :goto_0

    .line 267
    :pswitch_2
    const v5, 0x7f020151

    invoke-virtual {v0, v5}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    .line 268
    const v0, 0x7f0c00fe

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 269
    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 270
    const v0, 0x7f0c00ff

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 271
    invoke-virtual {v3, v7}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setMaxLines(I)V

    goto/16 :goto_0

    .line 223
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 366
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 367
    const v1, 0x7f0b022a

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 368
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 369
    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    packed-switch v0, :pswitch_data_0

    .line 386
    :goto_0
    return-void

    .line 371
    :pswitch_0
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 372
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 373
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 376
    :pswitch_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->b:Landroid/content/Context;

    const/high16 v3, 0x42900000    # 72.0f

    invoke-static {v0, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 378
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 381
    :pswitch_2
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 369
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private i(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 329
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v3

    .line 330
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v1, v2

    .line 332
    :goto_0
    if-ge v1, v4, :cond_5

    .line 333
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 334
    if-ne v4, v6, :cond_1

    .line 335
    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    .line 336
    iget v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-ne v6, v5, :cond_0

    .line 337
    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    .line 355
    :goto_1
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->i(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 332
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 339
    :cond_0
    const/4 v5, 0x3

    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    goto :goto_1

    .line 341
    :cond_1
    if-nez v1, :cond_2

    .line 342
    iput v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    .line 343
    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    goto :goto_1

    .line 344
    :cond_2
    add-int/lit8 v5, v4, -0x1

    if-ne v1, v5, :cond_4

    .line 345
    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    .line 346
    iget v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-ne v6, v5, :cond_3

    .line 347
    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    goto :goto_1

    .line 349
    :cond_3
    iput v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    goto :goto_1

    .line 352
    :cond_4
    iput v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->lineType:I

    .line 353
    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->shadeType:I

    goto :goto_1

    .line 357
    :cond_5
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 3

    .prologue
    const v2, 0x7f020054

    const/4 v1, 0x0

    .line 296
    const v0, 0x7f0b0023

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 297
    packed-switch p2, :pswitch_data_0

    .line 321
    :goto_0
    return-void

    .line 299
    :pswitch_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 300
    const v1, 0x7f020055

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 303
    :pswitch_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 304
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 307
    :pswitch_2
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 308
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 311
    :pswitch_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 312
    const v1, 0x7f020156

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 315
    :pswitch_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 316
    const v1, 0x7f020056

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method protected a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 80
    const v0, 0x7f0b0023

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 81
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 82
    packed-switch v0, :pswitch_data_0

    .line 95
    :goto_0
    return-void

    .line 84
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 87
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 90
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x4

    .line 468
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v4

    .line 469
    if-eqz v4, :cond_0

    .line 470
    invoke-interface {v4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 471
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 473
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 474
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 475
    iget v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    if-ne v3, v7, :cond_1

    move v0, v3

    .line 483
    :goto_1
    if-eq v3, v0, :cond_4

    .line 484
    if-ne v1, v5, :cond_2

    .line 493
    :goto_2
    invoke-interface {v4}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 494
    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 496
    invoke-virtual {p0, v4, v2}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 498
    :cond_0
    return-void

    .line 478
    :cond_1
    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    if-nez v0, :cond_5

    .line 479
    add-int/lit8 v0, v1, 0x1

    :goto_3
    move v1, v0

    .line 481
    goto :goto_0

    .line 486
    :cond_2
    if-nez v1, :cond_3

    .line 487
    const/4 v2, 0x1

    goto :goto_2

    .line 488
    :cond_3
    if-ge v1, v5, :cond_4

    move v2, v3

    .line 489
    goto :goto_2

    :cond_4
    move v2, v0

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_3

    :cond_6
    move v0, p2

    goto :goto_1
.end method

.method public b()I
    .locals 1

    .prologue
    .line 542
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/c;->d:I

    return v0
.end method

.method protected c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 53
    iget v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    packed-switch v1, :pswitch_data_0

    .line 66
    :goto_0
    return-void

    .line 55
    :pswitch_0
    const/4 v1, 0x1

    iput v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    goto :goto_0

    .line 58
    :pswitch_1
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    goto :goto_0

    .line 61
    :pswitch_2
    const/4 v1, 0x0

    iput v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    goto :goto_0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 425
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 426
    iget v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 427
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    packed-switch v2, :pswitch_data_0

    .line 440
    :goto_0
    :pswitch_0
    iput v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 441
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 442
    invoke-virtual {p0, p1, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 443
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/c;->notifyDataSetChanged()V

    .line 444
    return-void

    .line 430
    :pswitch_1
    const/4 v1, 0x1

    .line 431
    goto :goto_0

    .line 433
    :pswitch_2
    const/4 v1, 0x0

    .line 434
    goto :goto_0

    .line 427
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 507
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 508
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 509
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 510
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 511
    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    if-nez v1, :cond_0

    .line 512
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 515
    :cond_1
    return-object v2
.end method

.method public h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 526
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 527
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 528
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    if-nez v2, :cond_0

    .line 529
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    :cond_0
    const/4 v2, 0x1

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-ne v2, v0, :cond_1

    .line 532
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 533
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 536
    :cond_1
    return-object v1
.end method
