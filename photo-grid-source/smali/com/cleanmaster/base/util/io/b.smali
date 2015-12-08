.class public Lcom/cleanmaster/base/util/io/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-wide v0, p0, Lcom/cleanmaster/base/util/io/b;->a:J

    .line 10
    iput-wide v0, p0, Lcom/cleanmaster/base/util/io/b;->b:J

    .line 11
    return-void
.end method
