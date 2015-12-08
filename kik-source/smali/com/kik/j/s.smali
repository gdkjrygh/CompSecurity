.class public final Lcom/kik/j/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lkik/android/scan/d;


# direct methods
.method public constructor <init>(Lkik/a/j/n;Lkik/a/f/k;Lcom/kik/g/p;Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/r;)V
    .locals 7

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lkik/android/scan/d;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lkik/android/scan/d;-><init>(Lkik/a/j/n;Lkik/a/f/k;Lcom/kik/g/p;Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/r;)V

    iput-object v0, p0, Lcom/kik/j/s;->a:Lkik/android/scan/d;

    .line 30
    return-void
.end method


# virtual methods
.method final a()Lkik/android/scan/d;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/j/s;->a:Lkik/android/scan/d;

    return-object v0
.end method
