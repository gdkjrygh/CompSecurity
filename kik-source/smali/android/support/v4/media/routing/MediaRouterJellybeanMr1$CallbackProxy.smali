.class Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$CallbackProxy;
.super Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/routing/MediaRouterJellybeanMr1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CallbackProxy"
.end annotation


# direct methods
.method public constructor <init>(Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$Callback;)V
    .locals 0

    .prologue
    .line 167
    invoke-direct {p0, p1}, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;-><init>(Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;)V

    .line 168
    return-void
.end method


# virtual methods
.method public onRoutePresentationDisplayChanged(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;

    check-cast v0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$Callback;

    invoke-interface {v0, p2}, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$Callback;->onRoutePresentationDisplayChanged(Ljava/lang/Object;)V

    .line 174
    return-void
.end method
