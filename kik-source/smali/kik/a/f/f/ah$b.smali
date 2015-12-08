.class final Lkik/a/f/f/ah$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/f/f/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ah$b;->a:Ljava/util/List;

    .line 51
    iput-boolean p1, p0, Lkik/a/f/f/ah$b;->b:Z

    .line 52
    iput-object p3, p0, Lkik/a/f/f/ah$b;->c:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lkik/a/f/f/ah$b;->d:Ljava/lang/String;

    .line 54
    return-void
.end method
