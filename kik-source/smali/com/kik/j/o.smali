.class public final Lcom/kik/j/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/android/a;

.field private final b:Lcom/kik/c/b;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/v;Lkik/a/j/m;Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/w;Landroid/content/SharedPreferences;Lkik/android/chat/KikApplication;)V
    .locals 8

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Lcom/kik/c/b;

    new-instance v1, Lcom/kik/c/a;

    invoke-direct {v1, p7, p4}, Lcom/kik/c/a;-><init>(Landroid/content/Context;Lkik/a/e/v;)V

    const-string v2, "augmentum-metrics"

    const/4 v3, 0x0

    invoke-virtual {p7, v2, v3}, Lkik/android/chat/KikApplication;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kik/c/b;-><init>(Lcom/kik/c/d;Ljava/io/File;)V

    iput-object v0, p0, Lcom/kik/j/o;->b:Lcom/kik/c/b;

    .line 37
    new-instance v0, Lcom/kik/android/a;

    iget-object v7, p0, Lcom/kik/j/o;->b:Lcom/kik/c/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/kik/android/a;-><init>(Lcom/mixpanel/android/mpmetrics/v;Lkik/a/j/m;Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/w;Landroid/content/SharedPreferences;Lcom/kik/c/b;)V

    iput-object v0, p0, Lcom/kik/j/o;->a:Lcom/kik/android/a;

    .line 38
    return-void
.end method


# virtual methods
.method final a()Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/kik/j/o;->a:Lcom/kik/android/a;

    return-object v0
.end method
