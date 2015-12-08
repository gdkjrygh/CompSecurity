.class public final Lkik/a/i/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/i/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 8

    .prologue
    .line 25
    invoke-static {}, Lkik/a/h/i;->a()Ljava/lang/String;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lkik/a/i/h$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lkik/a/i/h$a;->a:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lkik/a/i/h$a;->b:Ljava/lang/String;

    .line 32
    iput-object p3, p0, Lkik/a/i/h$a;->c:Ljava/lang/String;

    .line 33
    iput-object p4, p0, Lkik/a/i/h$a;->d:Ljava/lang/String;

    .line 34
    iput-wide p5, p0, Lkik/a/i/h$a;->e:J

    .line 35
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/i/h$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 59
    iput-wide p1, p0, Lkik/a/i/h$a;->e:J

    .line 60
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/a/i/h$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/a/i/h$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/a/i/h$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 64
    iget-wide v0, p0, Lkik/a/i/h$a;->e:J

    return-wide v0
.end method
