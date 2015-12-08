.class public final Lcom/kik/android/c/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, -0x1

    .line 135
    check-cast p1, Lcom/kik/android/c/e;

    check-cast p2, Lcom/kik/android/c/e;

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/kik/android/c/e;->i()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/kik/android/c/e;->i()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/kik/android/c/e;->i()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/kik/android/c/e;->i()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method
