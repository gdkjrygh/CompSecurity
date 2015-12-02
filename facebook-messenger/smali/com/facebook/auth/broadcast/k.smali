.class public Lcom/facebook/auth/broadcast/k;
.super Ljava/lang/Object;
.source "NonCriticalUserDataCleaner.java"

# interfaces
.implements Lcom/facebook/auth/broadcast/b;


# instance fields
.field private final a:Lcom/facebook/auth/login/z;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/login/z;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/auth/broadcast/k;->a:Lcom/facebook/auth/login/z;

    .line 23
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/broadcast/k;->a:Lcom/facebook/auth/login/z;

    invoke-virtual {v0}, Lcom/facebook/auth/login/z;->f()V

    .line 28
    return-void
.end method
