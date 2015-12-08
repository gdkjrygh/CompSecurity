.class public final Lkik/android/chat/fragment/VideoTrimmingFragment$a;
.super Lkik/android/util/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/VideoTrimmingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 389
    invoke-direct {p0}, Lkik/android/util/an;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)Lkik/android/chat/fragment/VideoTrimmingFragment$a;
    .locals 1

    .prologue
    .line 404
    const-string v0, "VIDEO_DURATION"

    invoke-virtual {p0, v0, p1, p2}, Lkik/android/chat/fragment/VideoTrimmingFragment$a;->a(Ljava/lang/String;J)V

    .line 405
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/VideoTrimmingFragment$a;
    .locals 1

    .prologue
    .line 393
    const-string v0, "VIDEO_PATH"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/VideoTrimmingFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    return-object p0
.end method
