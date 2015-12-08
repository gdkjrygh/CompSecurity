.class public Lcom/hmobile/biblekjv/EditNotesActivity;
.super Landroid/app/Activity;
.source "EditNotesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private btnCancelNotes:Landroid/widget/Button;

.field private btnFavorite:Landroid/widget/Button;

.field private btnSaveNotes:Landroid/widget/Button;

.field private edtLable:Landroid/widget/EditText;

.field private edtTitle:Landroid/widget/EditText;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private ninfo:Lcom/hmobile/model/NotesInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private loadData()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtLable:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    iget-object v1, v1, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtTitle:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    iget-object v1, v1, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 70
    return-void
.end method


# virtual methods
.method public getDate(J)Ljava/lang/String;
    .locals 3
    .param p1, "milliSeconds"    # J

    .prologue
    .line 108
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "MMM/dd"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 109
    .local v1, "formatter":Ljava/text/DateFormat;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 110
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 111
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x1

    .line 80
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnSaveNotes:Landroid/widget/Button;

    if-ne p1, v2, :cond_3

    .line 81
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtLable:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 82
    .local v0, "lable":Ljava/lang/String;
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtTitle:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 83
    .local v1, "title":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v4, :cond_1

    .line 84
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "Please insert Lable."

    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 85
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 105
    .end local v0    # "lable":Ljava/lang/String;
    .end local v1    # "title":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 86
    .restart local v0    # "lable":Ljava/lang/String;
    .restart local v1    # "title":Ljava/lang/String;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v4, :cond_2

    .line 87
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "Please insert Title."

    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 88
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 91
    :cond_2
    :try_start_0
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    iput-object v0, v2, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    .line 92
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    iput-object v1, v2, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    .line 93
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v2}, Lcom/hmobile/model/NotesInfo;->save()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    :goto_1
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtTitle:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 97
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtLable:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 98
    invoke-virtual {p0, v5}, Lcom/hmobile/biblekjv/EditNotesActivity;->setResult(I)V

    .line 99
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->finish()V

    goto :goto_0

    .line 101
    .end local v0    # "lable":Ljava/lang/String;
    .end local v1    # "title":Ljava/lang/String;
    :cond_3
    iget-object v2, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnCancelNotes:Landroid/widget/Button;

    if-ne p1, v2, :cond_0

    .line 102
    invoke-virtual {p0, v5}, Lcom/hmobile/biblekjv/EditNotesActivity;->setResult(I)V

    .line 103
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->finish()V

    goto :goto_0

    .line 94
    .restart local v0    # "lable":Ljava/lang/String;
    .restart local v1    # "title":Ljava/lang/String;
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 32
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 33
    const v1, 0x7f03001b

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->setContentView(I)V

    .line 35
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 36
    .local v0, "b":Landroid/os/Bundle;
    const-wide/16 v2, 0x0

    .line 37
    .local v2, "id":J
    if-eqz v0, :cond_0

    .line 38
    const-string v1, "notes_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-virtual {v1, v4, v5}, Landroid/view/Window;->setLayout(II)V

    .line 41
    invoke-static {v2, v3}, Lcom/hmobile/model/NotesInfo;->getNotesInfoById(J)Lcom/hmobile/model/NotesInfo;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    .line 42
    const v1, 0x7f0700e2

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 44
    const v1, 0x7f0e004b

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnSaveNotes:Landroid/widget/Button;

    .line 45
    const v1, 0x7f0e004c

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnCancelNotes:Landroid/widget/Button;

    .line 46
    const v1, 0x7f0e0049

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtLable:Landroid/widget/EditText;

    .line 47
    const v1, 0x7f0e0048

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/EditNotesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->edtTitle:Landroid/widget/EditText;

    .line 50
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 53
    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    const v4, 0x7f070092

    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/EditNotesActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 55
    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v4, "/FavoritesActivity"

    invoke-virtual {v1, v4}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnCancelNotes:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->btnSaveNotes:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v1, p0, Lcom/hmobile/biblekjv/EditNotesActivity;->ninfo:Lcom/hmobile/model/NotesInfo;

    if-eqz v1, :cond_1

    .line 63
    invoke-direct {p0}, Lcom/hmobile/biblekjv/EditNotesActivity;->loadData()V

    .line 65
    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 74
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 75
    return-void
.end method
