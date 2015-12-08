.class final Lcom/cmcm/adsdk/nativead/af;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/aa;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/af;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 111
    const-string v0, "CMCMADSDK"

    const-string v1, "timeout, to check this load finish"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/af;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->g(Lcom/cmcm/adsdk/nativead/aa;)Z

    .line 113
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/af;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->h(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 114
    return-void
.end method
