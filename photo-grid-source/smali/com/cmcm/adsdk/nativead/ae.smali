.class final Lcom/cmcm/adsdk/nativead/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/aa;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 392
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/ae;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 395
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ae;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->l(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 396
    return-void
.end method
