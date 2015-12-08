.class public final Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$RouteInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPresentationDisplay(Ljava/lang/Object;)Landroid/view/Display;
    .locals 1

    .prologue
    .line 43
    check-cast p0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p0}, Landroid/media/MediaRouter$RouteInfo;->getPresentationDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public static isEnabled(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    check-cast p0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p0}, Landroid/media/MediaRouter$RouteInfo;->isEnabled()Z

    move-result v0

    return v0
.end method
