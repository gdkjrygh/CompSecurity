.class public Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;
.super Landroid/app/Activity;
.source "LaunchActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "LaunchActivity"

.field private static launch:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput-object v0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->launch:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->launch:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    const/high16 v0, 0x7f030000

    invoke-virtual {p0, v0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->setContentView(I)V

    .line 27
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0e0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 93
    const/4 v0, 0x1

    return v0
.end method

.method protected onStart()V
    .locals 6

    .prologue
    .line 31
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 32
    sput-object p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->launch:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    .line 70
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 71
    .local v0, "action":Landroid/content/Intent;
    const-string v1, "LA"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Data is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 73
    invoke-virtual {p0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 74
    const/high16 v1, 0x24000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 76
    :cond_0
    const v1, 0x7f080013

    invoke-virtual {p0, v1}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;

    invoke-direct {v2, p0, v0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;-><init>(Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;Landroid/content/Intent;)V

    const-wide/16 v4, 0x3e8

    invoke-virtual {v1, v2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 88
    return-void
.end method
