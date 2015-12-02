.class public Lcom/facebook/abtest/qe/l;
.super Lcom/facebook/inject/c;
.source "QuickExperimentPrefsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 36
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 26
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/l;->b(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    const-class v0, Lcom/facebook/prefs/provider/a;

    const-class v1, Lcom/facebook/prefs/provider/LibraryPreferencesList;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/l;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/provider/a;

    const-class v2, Lcom/facebook/abtest/qe/annotations/ForQuickExperiment;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 31
    const-class v0, Lcom/facebook/prefs/provider/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/l;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/annotations/ForQuickExperiment;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/n;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/n;-><init>(Lcom/facebook/abtest/qe/l;Lcom/facebook/abtest/qe/m;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 34
    return-void
.end method
