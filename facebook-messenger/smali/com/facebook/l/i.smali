.class public Lcom/facebook/l/i;
.super Ljava/lang/Object;
.source "MusicPresenceReceivedCallback.java"

# interfaces
.implements Lcom/facebook/l/b;


# instance fields
.field private final a:Lcom/facebook/l/k;


# direct methods
.method public constructor <init>(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/facebook/l/i;->a:Lcom/facebook/l/k;

    .line 10
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/facebook/l/i;->a:Lcom/facebook/l/k;

    invoke-virtual {v0, p1}, Lcom/facebook/l/k;->a(Z)V

    .line 14
    return-void
.end method
