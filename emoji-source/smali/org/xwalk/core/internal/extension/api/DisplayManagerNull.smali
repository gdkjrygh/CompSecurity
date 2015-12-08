.class public Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;
.super Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
.source "DisplayManagerNull.java"


# static fields
.field private static final NO_DISPLAYS:[Landroid/view/Display;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const/4 v0, 0x0

    new-array v0, v0, [Landroid/view/Display;

    sput-object v0, Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;->NO_DISPLAYS:[Landroid/view/Display;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method public getDisplay(I)Landroid/view/Display;
    .locals 1
    .param p1, "displayId"    # I

    .prologue
    .line 20
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDisplays()[Landroid/view/Display;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;->NO_DISPLAYS:[Landroid/view/Display;

    return-object v0
.end method

.method public getPresentationDisplays()[Landroid/view/Display;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;->NO_DISPLAYS:[Landroid/view/Display;

    return-object v0
.end method
