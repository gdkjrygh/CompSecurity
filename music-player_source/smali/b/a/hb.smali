.class public final Lb/a/hb;
.super Lb/a/fq;


# instance fields
.field protected a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/a/fq;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb/a/hb;->a:I

    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    invoke-direct {p0}, Lb/a/fq;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb/a/hb;->a:I

    const/4 v0, 0x4

    iput v0, p0, Lb/a/hb;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Lb/a/fq;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput v0, p0, Lb/a/hb;->a:I

    const/4 v0, 0x1

    iput v0, p0, Lb/a/hb;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;B)V
    .locals 1

    invoke-direct {p0, p1}, Lb/a/fq;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput v0, p0, Lb/a/hb;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lb/a/fq;-><init>(Ljava/lang/Throwable;)V

    iput v0, p0, Lb/a/hb;->a:I

    iput v0, p0, Lb/a/hb;->a:I

    return-void
.end method
