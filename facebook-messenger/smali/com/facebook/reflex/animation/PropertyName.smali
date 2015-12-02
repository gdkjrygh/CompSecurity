.class public final Lcom/facebook/reflex/animation/PropertyName;
.super Ljava/lang/Object;
.source "PropertyName.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# instance fields
.field private final mNativePtr:I
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/b;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p2}, Lcom/facebook/reflex/animation/b;->ordinal()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/reflex/animation/PropertyName;->fromField(Lcom/facebook/reflex/animation/PropertyName;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/animation/PropertyName;->mNativePtr:I

    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/reflex/animation/PropertyName;->fromString(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/animation/PropertyName;->mNativePtr:I

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/reflex/animation/b;)V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/facebook/reflex/animation/PropertyName;

    invoke-direct {v0, p1}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/b;)V

    .line 20
    return-void
.end method

.method private native fromField(Lcom/facebook/reflex/animation/PropertyName;I)I
.end method

.method private native fromString(Ljava/lang/String;)I
.end method

.method private native withParent(Lcom/facebook/reflex/animation/PropertyName;Ljava/lang/String;)I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/reflex/animation/PropertyName;->mNativePtr:I

    check-cast p1, Lcom/facebook/reflex/animation/PropertyName;

    iget v1, p1, Lcom/facebook/reflex/animation/PropertyName;->mNativePtr:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
