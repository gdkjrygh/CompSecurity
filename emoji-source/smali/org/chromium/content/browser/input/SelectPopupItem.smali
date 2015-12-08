.class public Lorg/chromium/content/browser/input/SelectPopupItem;
.super Ljava/lang/Object;
.source "SelectPopupItem.java"

# interfaces
.implements Lorg/chromium/ui/DropdownItem;


# instance fields
.field private final mLabel:Ljava/lang/String;

.field private final mType:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "type"    # I

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mLabel:Ljava/lang/String;

    .line 19
    iput p2, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mType:I

    .line 20
    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getSublabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    return-object v0
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mType:I

    return v0
.end method

.method public isEnabled()Z
    .locals 2

    .prologue
    .line 34
    iget v0, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mType:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mType:I

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isGroupHeader()Z
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lorg/chromium/content/browser/input/SelectPopupItem;->mType:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
