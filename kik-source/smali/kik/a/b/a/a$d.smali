.class public final Lkik/a/b/a/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:J

.field private e:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;J)V
    .locals 1

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-wide p1, p0, Lkik/a/b/a/a$d;->b:J

    .line 130
    iput-wide p3, p0, Lkik/a/b/a/a$d;->e:J

    .line 131
    iput-object p5, p0, Lkik/a/b/a/a$d;->a:Ljava/lang/String;

    .line 132
    iput-wide p6, p0, Lkik/a/b/a/a$d;->d:J

    .line 133
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    .prologue
    .line 137
    iget-wide v0, p0, Lkik/a/b/a/a$d;->e:J

    sub-long v0, p1, v0

    iput-wide v0, p0, Lkik/a/b/a/a$d;->c:J

    .line 138
    return-void
.end method
