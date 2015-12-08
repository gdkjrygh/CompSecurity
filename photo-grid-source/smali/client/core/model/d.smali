.class public final Lclient/core/model/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field final synthetic c:Lclient/core/model/a;


# direct methods
.method public constructor <init>(Lclient/core/model/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 23
    iput-object p1, p0, Lclient/core/model/d;->c:Lclient/core/model/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lclient/core/model/d;->a:Ljava/lang/String;

    .line 29
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lclient/core/model/d;->b:J

    .line 24
    iput-object p2, p0, Lclient/core/model/d;->a:Ljava/lang/String;

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lclient/core/model/d;->b:J

    .line 26
    return-void
.end method
