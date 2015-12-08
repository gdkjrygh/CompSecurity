.class public Lcom/QRBS/activity/CalendarList;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CalendarList.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/CalendarList$MyTask;
    }
.end annotation


# instance fields
.field CalID:J

.field a:Landroid/app/Activity;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/scannerfire/utils/EncodeUtils$ICal;",
            ">;"
        }
    .end annotation
.end field

.field lv:Landroid/widget/ListView;

.field private prog:Landroid/app/ProgressDialog;

.field utils:Lcom/scannerfire/utils/Utils;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 30
    new-instance v0, Lcom/scannerfire/utils/Utils;

    invoke-direct {v0}, Lcom/scannerfire/utils/Utils;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CalendarList;->utils:Lcom/scannerfire/utils/Utils;

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/QRBS/activity/CalendarList;->CalID:J

    .line 27
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CalendarList;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/QRBS/activity/CalendarList;->prog:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    const v2, 0x7f030020

    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CalendarList;->setContentView(I)V

    .line 38
    invoke-virtual {p0}, Lcom/QRBS/activity/CalendarList;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 39
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v2, 0x7f0200d4

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 40
    const v2, 0x7f0800b1

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 41
    const v2, 0x7f0800c8

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 42
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 43
    iput-object p0, p0, Lcom/QRBS/activity/CalendarList;->a:Landroid/app/Activity;

    .line 44
    invoke-virtual {p0}, Lcom/QRBS/activity/CalendarList;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "CalendarID"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/QRBS/activity/CalendarList;->CalID:J

    .line 45
    const v2, 0x7f0d0076

    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CalendarList;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ListView;

    iput-object v2, p0, Lcom/QRBS/activity/CalendarList;->lv:Landroid/widget/ListView;

    .line 46
    iget-object v2, p0, Lcom/QRBS/activity/CalendarList;->lv:Landroid/widget/ListView;

    const v3, 0x7f0200e7

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setSelector(I)V

    .line 47
    iget-object v2, p0, Lcom/QRBS/activity/CalendarList;->lv:Landroid/widget/ListView;

    new-instance v3, Lcom/QRBS/activity/CalendarList$1;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/CalendarList$1;-><init>(Lcom/QRBS/activity/CalendarList;)V

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 64
    iget-object v2, p0, Lcom/QRBS/activity/CalendarList;->utils:Lcom/scannerfire/utils/Utils;

    const v3, 0x7f0800f8

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CalendarList;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f0800f9

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/CalendarList;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, p0, v3, v4}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/QRBS/activity/CalendarList;->prog:Landroid/app/ProgressDialog;

    .line 65
    new-instance v1, Lcom/QRBS/activity/CalendarList$MyTask;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/QRBS/activity/CalendarList$MyTask;-><init>(Lcom/QRBS/activity/CalendarList;Lcom/QRBS/activity/CalendarList$MyTask;)V

    .line 66
    .local v1, "t":Lcom/QRBS/activity/CalendarList$MyTask;
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/CalendarList$MyTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 67
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 124
    invoke-virtual {p0}, Lcom/QRBS/activity/CalendarList;->finish()V

    .line 125
    const/4 v0, 0x1

    return v0
.end method
