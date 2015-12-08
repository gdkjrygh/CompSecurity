.class final Lcom/cmcm/adsdk/nativead/u;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/s;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/s;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/u;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 46
    const-string v0, "FBNativeLoader"

    const-string v1, "request timeOut, set loading finish "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/u;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->a(Lcom/cmcm/adsdk/nativead/s;)V

    .line 48
    return-void
.end method
