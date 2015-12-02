.class Lcom/qihoo/security/locale/d$2;
.super Lcom/qihoo/security/locale/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/d;)V
    .locals 0

    .prologue
    .line 844
    iput-object p1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-direct {p0}, Lcom/qihoo/security/locale/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 943
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 950
    return-void
.end method

.method public a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 860
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0, p1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;Z)Z

    .line 861
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0, p2}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;Z)Z

    .line 862
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0, p3}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;

    .line 866
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0, p4}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;

    .line 867
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0, p5}, Lcom/qihoo/security/locale/d;->c(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;

    .line 869
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->d(Lcom/qihoo/security/locale/d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/d;Landroid/content/res/Resources;)Landroid/content/res/Resources;

    .line 871
    if-eqz p2, :cond_0

    .line 873
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 874
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 880
    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v2}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 939
    :goto_0
    return-void

    .line 885
    :cond_0
    if-eqz p1, :cond_2

    .line 887
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 888
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 889
    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v2}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 892
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->f(Lcom/qihoo/security/locale/d;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 894
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->g(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/lib/resl/ExtResources;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->unloadAll()V

    .line 896
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->g(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/lib/resl/ExtResources;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->f(Lcom/qihoo/security/locale/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources;->initResources(Ljava/lang/String;)V

    .line 897
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->g(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/lib/resl/ExtResources;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->loadAllRes()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 898
    :catch_0
    move-exception v0

    goto :goto_0

    .line 909
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->d(Lcom/qihoo/security/locale/d;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p4, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/d;Landroid/content/res/Resources;)Landroid/content/res/Resources;

    .line 910
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->h(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 911
    invoke-static {p3}, Lcom/qihoo/security/locale/d;->d(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 912
    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->h(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v2}, Lcom/qihoo/security/locale/d;->h(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 917
    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 925
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 926
    invoke-static {p3}, Lcom/qihoo/security/locale/d;->d(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 927
    iget-object v1, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/locale/d$2;->a:Lcom/qihoo/security/locale/d;

    invoke-static {v2}, Lcom/qihoo/security/locale/d;->e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    goto/16 :goto_0

    .line 902
    :catch_2
    move-exception v0

    goto/16 :goto_0
.end method

.method public b()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 957
    return-void
.end method

.method public c()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 850
    return-void
.end method

.method public d()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 964
    return-void
.end method
