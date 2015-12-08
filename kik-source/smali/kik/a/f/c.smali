.class public final Lkik/a/f/c;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field final a:J

.field final b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 15
    iput-wide p2, p0, Lkik/a/f/c;->b:J

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/f/c;->a:J

    .line 17
    return-void
.end method
