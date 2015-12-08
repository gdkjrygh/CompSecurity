.class public final Lcom/kik/j/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/c/c;


# direct methods
.method public constructor <init>(Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Lkik/a/c/c;

    invoke-direct {v0, p1, p2, p3}, Lkik/a/c/c;-><init>(Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/v;)V

    iput-object v0, p0, Lcom/kik/j/m;->a:Lkik/a/c/c;

    .line 20
    return-void
.end method


# virtual methods
.method final a()Lkik/a/c/c;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/kik/j/m;->a:Lkik/a/c/c;

    return-object v0
.end method
