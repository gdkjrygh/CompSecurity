.class public Lcom/QRBS/activity/CreateApp;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateApp.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/CreateApp$MyTask;
    }
.end annotation


# static fields
.field private static lv:Landroid/widget/ListView;


# instance fields
.field protected activity:Landroid/app/Activity;

.field private appnames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private icons:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private packNames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private prog:Landroid/app/ProgressDialog;

.field private utils:Lcom/scannerfire/utils/Utils;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 30
    new-instance v0, Lcom/scannerfire/utils/Utils;

    invoke-direct {v0}, Lcom/scannerfire/utils/Utils;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CreateApp;->utils:Lcom/scannerfire/utils/Utils;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CreateApp;->appnames:Ljava/util/ArrayList;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CreateApp;->icons:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;

    .line 34
    iput-object p0, p0, Lcom/QRBS/activity/CreateApp;->activity:Landroid/app/Activity;

    .line 27
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/QRBS/activity/CreateApp;->icons:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/QRBS/activity/CreateApp;->appnames:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$2(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$3(Lcom/QRBS/activity/CreateApp;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/QRBS/activity/CreateApp;->prog:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$4()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/QRBS/activity/CreateApp;->lv:Landroid/widget/ListView;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    const v2, 0x7f030020

    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CreateApp;->setContentView(I)V

    .line 41
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateApp;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 42
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v2, 0x7f0200d4

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 43
    const v2, 0x7f0800b1

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 44
    const v2, 0x7f0800ca

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 45
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 46
    const v2, 0x7f0d0076

    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CreateApp;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ListView;

    sput-object v2, Lcom/QRBS/activity/CreateApp;->lv:Landroid/widget/ListView;

    .line 47
    sget-object v2, Lcom/QRBS/activity/CreateApp;->lv:Landroid/widget/ListView;

    new-instance v3, Lcom/QRBS/activity/CreateApp$1;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/CreateApp$1;-><init>(Lcom/QRBS/activity/CreateApp;)V

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 58
    iget-object v2, p0, Lcom/QRBS/activity/CreateApp;->utils:Lcom/scannerfire/utils/Utils;

    const v3, 0x7f0800f8

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateApp;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f0800f9

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/CreateApp;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, p0, v3, v4}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/QRBS/activity/CreateApp;->prog:Landroid/app/ProgressDialog;

    .line 59
    new-instance v1, Lcom/QRBS/activity/CreateApp$MyTask;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/QRBS/activity/CreateApp$MyTask;-><init>(Lcom/QRBS/activity/CreateApp;Lcom/QRBS/activity/CreateApp$MyTask;)V

    .line 60
    .local v1, "t":Lcom/QRBS/activity/CreateApp$MyTask;
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/CreateApp$MyTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 62
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 67
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->onDestroy()V

    .line 68
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 109
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateApp;->finish()V

    .line 110
    const/4 v0, 0x1

    return v0
.end method
