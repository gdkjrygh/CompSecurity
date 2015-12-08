.class public final enum Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;
.super Ljava/lang/Enum;
.source "ContentViewRenderView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ContentViewRenderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CompositingSurfaceType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

.field public static final enum SURFACE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

.field public static final enum TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 42
    new-instance v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    const-string v1, "SURFACE_VIEW"

    invoke-direct {v0, v1, v2}, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->SURFACE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    new-instance v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    const-string v1, "TEXTURE_VIEW"

    invoke-direct {v0, v1, v3}, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    sget-object v1, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->SURFACE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    aput-object v1, v0, v3

    sput-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->$VALUES:[Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 42
    const-class v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    return-object v0
.end method

.method public static values()[Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->$VALUES:[Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    invoke-virtual {v0}, [Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    return-object v0
.end method
