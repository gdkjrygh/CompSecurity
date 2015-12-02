.class public Lcom/facebook/debug/e/b;
.super Ljava/lang/Object;
.source "TrafficTracker.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/facebook/debug/e/b;->a:Ljava/lang/String;

    .line 81
    iput p2, p0, Lcom/facebook/debug/e/b;->b:I

    .line 82
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/debug/e/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/facebook/debug/e/b;->b:I

    return v0
.end method
