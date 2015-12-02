.class public Lcom/facebook/orca/nux/SmsNuxDetailActivity;
.super Lcom/facebook/base/activity/i;
.source "SmsNuxDetailActivity.java"


# instance fields
.field private p:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/nux/SmsNuxDetailActivity;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->j()V

    return-void
.end method

.method private j()V
    .locals 0

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->finish()V

    .line 46
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 24
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 26
    sget v0, Lcom/facebook/k;->orca_nux_sms_details:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->setContentView(I)V

    .line 28
    invoke-virtual {p0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 29
    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->p:Lcom/facebook/prefs/shared/d;

    .line 31
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 32
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    .line 33
    sget v1, Lcom/facebook/o;->app_name:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 35
    sget v0, Lcom/facebook/i;->sms_nux_detail_okay_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/SmsNuxDetailActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 36
    new-instance v1, Lcom/facebook/orca/nux/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/j;-><init>(Lcom/facebook/orca/nux/SmsNuxDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    return-void
.end method
