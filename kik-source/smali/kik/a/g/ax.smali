.class final Lkik/a/g/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/r$a;


# instance fields
.field final synthetic a:Lkik/a/g/aw;


# direct methods
.method constructor <init>(Lkik/a/g/aw;)V
    .locals 0

    .prologue
    .line 1069
    iput-object p1, p0, Lkik/a/g/ax;->a:Lkik/a/g/aw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 1073
    invoke-virtual {p1}, Lkik/a/d/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 1075
    rsub-int/lit8 v1, v0, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1077
    invoke-virtual {p1, v0}, Lkik/a/d/k;->a(I)V

    .line 1078
    return-void
.end method
