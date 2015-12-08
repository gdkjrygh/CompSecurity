.class public Lorg/chromium/base/FieldTrialList;
.super Ljava/lang/Object;
.source "FieldTrialList.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findFullName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "trialName"    # Ljava/lang/String;

    .prologue
    .line 20
    invoke-static {p0}, Lorg/chromium/base/FieldTrialList;->nativeFindFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static native nativeFindFullName(Ljava/lang/String;)Ljava/lang/String;
.end method
