.class Lorg/chromium/base/ApplicationStatus$ActivityInfo;
.super Ljava/lang/Object;
.source "ApplicationStatus.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/ApplicationStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ActivityInfo"
.end annotation


# instance fields
.field private mListeners:Lorg/chromium/base/ObserverList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/base/ApplicationStatus$ActivityStateListener;",
            ">;"
        }
    .end annotation
.end field

.field private mStatus:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x6

    iput v0, p0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->mStatus:I

    .line 27
    new-instance v0, Lorg/chromium/base/ObserverList;

    invoke-direct {v0}, Lorg/chromium/base/ObserverList;-><init>()V

    iput-object v0, p0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->mListeners:Lorg/chromium/base/ObserverList;

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/base/ApplicationStatus$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/base/ApplicationStatus$1;

    .prologue
    .line 25
    invoke-direct {p0}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;-><init>()V

    return-void
.end method


# virtual methods
.method public getListeners()Lorg/chromium/base/ObserverList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/base/ApplicationStatus$ActivityStateListener;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->mListeners:Lorg/chromium/base/ObserverList;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->mStatus:I

    return v0
.end method

.method public setStatus(I)V
    .locals 0
    .param p1, "status"    # I

    .prologue
    .line 41
    iput p1, p0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->mStatus:I

    .line 42
    return-void
.end method
