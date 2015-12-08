.class public final Lkik/android/util/cv$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/cv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field final a:F

.field final b:F

.field final c:F

.field final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lkik/android/util/cv$d;->a:F

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/util/cv$d;->b:F

    .line 101
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lkik/android/util/cv$d;->c:F

    .line 102
    iput p1, p0, Lkik/android/util/cv$d;->d:I

    .line 103
    return-void
.end method
