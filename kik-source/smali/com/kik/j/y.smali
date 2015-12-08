.class public final Lcom/kik/j/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkik/android/util/ck;


# direct methods
.method public constructor <init>(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;Lkik/a/e/l;Lkik/android/d/c;ZILkik/android/util/ar;)V
    .locals 9

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lkik/android/util/ck;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lkik/android/util/ck;-><init>(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;Lkik/a/e/l;Lkik/android/d/c;ZILkik/android/util/ar;)V

    iput-object v0, p0, Lcom/kik/j/y;->a:Lkik/android/util/ck;

    .line 22
    return-void
.end method


# virtual methods
.method final a()Lkik/android/util/ck;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/j/y;->a:Lkik/android/util/ck;

    return-object v0
.end method
