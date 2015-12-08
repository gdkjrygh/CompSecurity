.class public Lcom/aetn/history/android/historyhere/view/MoreActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "MoreActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MoreActivity"


# instance fields
.field private aboutButton:Landroid/view/ViewGroup;

.field private adChoicesButton:Landroid/view/ViewGroup;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private feedbackButton:Landroid/view/ViewGroup;

.field private localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

.field private mContext:Landroid/content/Context;

.field private privacyPolicyButton:Landroid/view/ViewGroup;

.field private suggestButton:Landroid/view/ViewGroup;

.field private termsOfUseButton:Landroid/view/ViewGroup;

.field private textView:Landroid/widget/TextView;

.field private textViewHeader:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/MoreActivity;

    .prologue
    .line 23
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/localytics/android/LocalyticsAmpSession;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/MoreActivity;

    .prologue
    .line 23
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    return-object v0
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/view/MoreActivity;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/MoreActivity;

    .prologue
    .line 23
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    return-object v0
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->suggestButton:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/MoreActivity$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity$1;-><init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->aboutButton:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/MoreActivity$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity$2;-><init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->privacyPolicyButton:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/MoreActivity$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity$3;-><init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->termsOfUseButton:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity$4;-><init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->feedbackButton:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity$5;-><init>(Lcom/aetn/history/android/historyhere/view/MoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 45
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    iput-object p0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->mContext:Landroid/content/Context;

    .line 48
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 50
    const v0, 0x7f030043

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->setContentView(I)V

    .line 52
    const v0, 0x7f0a00c7

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->privacyPolicyButton:Landroid/view/ViewGroup;

    .line 53
    const v0, 0x7f0a00c8

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->termsOfUseButton:Landroid/view/ViewGroup;

    .line 54
    const v0, 0x7f0a00c4

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->suggestButton:Landroid/view/ViewGroup;

    .line 55
    const v0, 0x7f0a00c5

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->aboutButton:Landroid/view/ViewGroup;

    .line 56
    const v0, 0x7f0a00c6

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->feedbackButton:Landroid/view/ViewGroup;

    .line 58
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->setListeners()V

    .line 61
    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getLocalyticsKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    .line 62
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    const-string v1, "HH:More"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 66
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 150
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 155
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 163
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 157
    :pswitch_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/MoreActivity;->finish()V

    goto :goto_0

    .line 155
    nop

    :pswitch_data_0
    .packed-switch 0x102002c
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->detach()V

    .line 79
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->close()V

    .line 80
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 82
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 83
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 70
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 71
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 72
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 73
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/MoreActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p0}, Lcom/localytics/android/LocalyticsAmpSession;->attach(Landroid/support/v4/app/FragmentActivity;)V

    .line 74
    return-void
.end method
