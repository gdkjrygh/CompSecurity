.class public final Lcom/kik/cards/web/video/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/kik/cards/web/video/a;->a:Ljava/lang/String;

    .line 11
    iput-wide p2, p0, Lcom/kik/cards/web/video/a;->b:J

    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/kik/cards/web/video/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 16
    iput-object p1, p0, Lcom/kik/cards/web/video/a;->a:Ljava/lang/String;

    .line 17
    iput-wide p2, p0, Lcom/kik/cards/web/video/a;->b:J

    .line 18
    return-void
.end method

.method public final b()J
    .locals 2

    .prologue
    .line 27
    iget-wide v0, p0, Lcom/kik/cards/web/video/a;->b:J

    return-wide v0
.end method
