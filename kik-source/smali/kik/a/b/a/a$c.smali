.class public final Lkik/a/b/a/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Lkik/a/d/s;


# direct methods
.method public constructor <init>(Lkik/a/d/s;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lkik/a/b/a/a$c;->c:Lkik/a/d/s;

    .line 105
    iput-object p2, p0, Lkik/a/b/a/a$c;->a:Ljava/lang/String;

    .line 106
    iput-wide p3, p0, Lkik/a/b/a/a$c;->b:J

    .line 107
    return-void
.end method
