.class public Lorg/acra/util/SimpleTraceLogger$TraceLogLine;
.super Ljava/lang/Object;
.source "SimpleTraceLogger.java"


# instance fields
.field public final time:J

.field public final trace:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;->trace:Ljava/lang/String;

    .line 23
    iput-wide p2, p0, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;->time:J

    .line 24
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 28
    const-string v0, "[%d] %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-wide v3, p0, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;->time:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/acra/util/SimpleTraceLogger$TraceLogLine;->trace:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
