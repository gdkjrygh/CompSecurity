.class public abstract Lcom/qihoo/security/c/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field static h:J


# instance fields
.field private a:I

.field public g:Z

.field public final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 21
    const-wide/16 v0, 0x1

    sput-wide v0, Lcom/qihoo/security/c/b;->h:J

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/c/b;->a:I

    .line 10
    sget-wide v0, Lcom/qihoo/security/c/b;->h:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    sput-wide v2, Lcom/qihoo/security/c/b;->h:J

    iput-wide v0, p0, Lcom/qihoo/security/c/b;->i:J

    .line 11
    return-void
.end method
