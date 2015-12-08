.class public final Lcom/kik/j/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/android/c/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/w;Lkik/a/e/t;Lkik/android/util/ar;Lkik/a/e/q;)V
    .locals 9

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lcom/kik/android/c/f;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/kik/android/c/f;-><init>(Landroid/content/Context;Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/w;Lkik/a/e/t;Lkik/android/util/ar;Lkik/a/e/q;)V

    iput-object v0, p0, Lcom/kik/j/w;->a:Lcom/kik/android/c/f;

    .line 28
    return-void
.end method


# virtual methods
.method final a()Lcom/kik/android/c/f;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/kik/j/w;->a:Lcom/kik/android/c/f;

    return-object v0
.end method
