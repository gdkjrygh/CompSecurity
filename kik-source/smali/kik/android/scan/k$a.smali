.class public final Lkik/android/scan/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/scan/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:[B

.field public final b:Lcom/kik/scan/KikCode;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method private constructor <init>([BLcom/kik/scan/KikCode;IIII)V
    .locals 0

    .prologue
    .line 274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 275
    iput-object p1, p0, Lkik/android/scan/k$a;->a:[B

    .line 276
    iput-object p2, p0, Lkik/android/scan/k$a;->b:Lcom/kik/scan/KikCode;

    .line 277
    iput p3, p0, Lkik/android/scan/k$a;->c:I

    .line 278
    iput p4, p0, Lkik/android/scan/k$a;->d:I

    .line 279
    iput p5, p0, Lkik/android/scan/k$a;->e:I

    .line 280
    iput p6, p0, Lkik/android/scan/k$a;->f:I

    .line 281
    return-void
.end method

.method synthetic constructor <init>([BLcom/kik/scan/KikCode;IIIIB)V
    .locals 0

    .prologue
    .line 264
    invoke-direct/range {p0 .. p6}, Lkik/android/scan/k$a;-><init>([BLcom/kik/scan/KikCode;IIII)V

    return-void
.end method
