.class public Lcom/QRBS/activity/CalendarListSel;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CalendarListSel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/CalendarListSel$DummyAsyncTask;,
        Lcom/QRBS/activity/CalendarListSel$MyTask;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/scannerfire/utils/EncodeUtils$CalSel;",
            ">;"
        }
    .end annotation
.end field

.field lv:Landroid/widget/ListView;

.field private prog:Landroid/app/ProgressDialog;

.field utils:Lcom/scannerfire/utils/Utils;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 31
    new-instance v0, Lcom/scannerfire/utils/Utils;

    invoke-direct {v0}, Lcom/scannerfire/utils/Utils;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CalendarListSel;->utils:Lcom/scannerfire/utils/Utils;

    .line 28
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CalendarListSel;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/QRBS/activity/CalendarListSel;->prog:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    const v1, 0x7f030020

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/CalendarListSel;->setContentView(I)V

    .line 38
    invoke-virtual {p0}, Lcom/QRBS/activity/CalendarListSel;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 39
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v1, 0x7f0200d4

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 40
    const v1, 0x7f0800b1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 41
    const v1, 0x7f0800c9

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 42
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 43
    iput-object p0, p0, Lcom/QRBS/activity/CalendarListSel;->a:Landroid/app/Activity;

    .line 44
    const v1, 0x7f0d0076

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/CalendarListSel;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/QRBS/activity/CalendarListSel;->lv:Landroid/widget/ListView;

    .line 45
    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel;->lv:Landroid/widget/ListView;

    const v2, 0x7f0200e7

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setSelector(I)V

    .line 46
    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel;->lv:Landroid/widget/ListView;

    new-instance v2, Lcom/QRBS/activity/CalendarListSel$1;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/CalendarListSel$1;-><init>(Lcom/QRBS/activity/CalendarListSel;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 57
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/QRBS/activity/CalendarListSel;->finish()V

    .line 108
    const/4 v0, 0x1

    return v0
.end method

.method protected onStart()V
    .locals 4

    .prologue
    .line 60
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->onStart()V

    .line 61
    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel;->utils:Lcom/scannerfire/utils/Utils;

    const v2, 0x7f0800f8

    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CalendarListSel;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0800f9

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CalendarListSel;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p0, v2, v3}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/QRBS/activity/CalendarListSel;->prog:Landroid/app/ProgressDialog;

    .line 62
    new-instance v0, Lcom/QRBS/activity/CalendarListSel$MyTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/QRBS/activity/CalendarListSel$MyTask;-><init>(Lcom/QRBS/activity/CalendarListSel;Lcom/QRBS/activity/CalendarListSel$MyTask;)V

    .line 63
    .local v0, "t":Lcom/QRBS/activity/CalendarListSel$MyTask;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/CalendarListSel$MyTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 64
    return-void
.end method
