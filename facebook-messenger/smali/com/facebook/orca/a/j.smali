.class public Lcom/facebook/orca/a/j;
.super Ljava/lang/Object;
.source "SendMessageParametersExperiment.java"


# static fields
.field public static final a:Lcom/facebook/orca/a/j;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:I

.field public final e:J

.field public final f:I

.field public final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/4 v5, 0x1

    const-wide/16 v3, 0x0

    .line 17
    new-instance v0, Lcom/facebook/orca/a/j;

    const-wide/16 v1, 0x1388

    move-wide v6, v3

    move v8, v5

    move-wide v9, v3

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/a/j;-><init>(JJIJIJ)V

    sput-object v0, Lcom/facebook/orca/a/j;->a:Lcom/facebook/orca/a/j;

    return-void
.end method

.method public constructor <init>(JJIJIJ)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Lcom/facebook/orca/a/j;->b:J

    .line 42
    iput-wide p3, p0, Lcom/facebook/orca/a/j;->c:J

    .line 43
    iput p5, p0, Lcom/facebook/orca/a/j;->d:I

    .line 44
    iput-wide p6, p0, Lcom/facebook/orca/a/j;->e:J

    .line 45
    iput p8, p0, Lcom/facebook/orca/a/j;->f:I

    .line 46
    iput-wide p9, p0, Lcom/facebook/orca/a/j;->g:J

    .line 47
    return-void
.end method
