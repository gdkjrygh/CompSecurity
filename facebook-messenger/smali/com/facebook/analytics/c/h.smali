.class public Lcom/facebook/analytics/c/h;
.super Ljava/lang/Object;
.source "AnalyticsStorage.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Z

.field final synthetic g:Lcom/facebook/analytics/c/g;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/c/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JZ)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/analytics/c/h;->g:Lcom/facebook/analytics/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p2, p0, Lcom/facebook/analytics/c/h;->a:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Lcom/facebook/analytics/c/h;->b:Ljava/lang/String;

    .line 67
    iput-wide p4, p0, Lcom/facebook/analytics/c/h;->c:J

    .line 68
    iput-object p6, p0, Lcom/facebook/analytics/c/h;->e:Ljava/lang/String;

    .line 69
    iput-boolean p9, p0, Lcom/facebook/analytics/c/h;->f:Z

    .line 70
    iput-wide p7, p0, Lcom/facebook/analytics/c/h;->d:J

    .line 71
    return-void
.end method
