.class public final Lb/a/gj;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/gp;


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lb/a/gj;->a:J

    return-void
.end method


# virtual methods
.method public final a(Lb/a/ha;)Lb/a/gn;
    .locals 4

    new-instance v0, Lb/a/gi;

    iget-wide v2, p0, Lb/a/gj;->a:J

    invoke-direct {v0, p1, v2, v3}, Lb/a/gi;-><init>(Lb/a/ha;J)V

    return-object v0
.end method
