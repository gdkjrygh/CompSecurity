.class final Lb/a/a/a/a/d/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/d/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/io/File;

.field final b:J


# direct methods
.method public constructor <init>(Ljava/io/File;J)V
    .locals 0

    .prologue
    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    iput-object p1, p0, Lb/a/a/a/a/d/d$a;->a:Ljava/io/File;

    .line 242
    iput-wide p2, p0, Lb/a/a/a/a/d/d$a;->b:J

    .line 243
    return-void
.end method
