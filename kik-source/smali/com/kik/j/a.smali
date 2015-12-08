.class public final Lcom/kik/j/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lkik/a/a/c;


# direct methods
.method public constructor <init>(Lkik/a/e/a;Lkik/a/a/l;Lkik/a/e/k;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lkik/a/a/c;

    invoke-direct {v0, p1, p2, p3}, Lkik/a/a/c;-><init>(Lkik/a/e/a;Lkik/a/a/l;Lkik/a/e/k;)V

    iput-object v0, p0, Lcom/kik/j/a;->a:Lkik/a/a/c;

    .line 21
    return-void
.end method


# virtual methods
.method final a()Lkik/a/a/c;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/j/a;->a:Lkik/a/a/c;

    return-object v0
.end method
