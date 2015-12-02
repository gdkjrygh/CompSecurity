.class public Lcom/facebook/orca/app/dt;
.super Ljava/lang/Object;
.source "MessagesPerUserDataManager.java"


# instance fields
.field private final a:Lcom/facebook/orca/g/aa;

.field private final b:Lcom/facebook/orca/g/p;

.field private final c:Lcom/facebook/orca/f/ad;

.field private final d:Lcom/facebook/orca/f/z;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/p;Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/app/dt;->a:Lcom/facebook/orca/g/aa;

    .line 26
    iput-object p2, p0, Lcom/facebook/orca/app/dt;->b:Lcom/facebook/orca/g/p;

    .line 27
    iput-object p3, p0, Lcom/facebook/orca/app/dt;->c:Lcom/facebook/orca/f/ad;

    .line 28
    iput-object p4, p0, Lcom/facebook/orca/app/dt;->d:Lcom/facebook/orca/f/z;

    .line 29
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->b()V

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->b:Lcom/facebook/orca/g/p;

    invoke-virtual {v0}, Lcom/facebook/orca/g/p;->a()V

    .line 34
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/f/ad;->b()V

    .line 35
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->a()V

    .line 36
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/f/ad;->c()V

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->b()V

    .line 41
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->c()V

    .line 45
    iget-object v0, p0, Lcom/facebook/orca/app/dt;->b:Lcom/facebook/orca/g/p;

    invoke-virtual {v0}, Lcom/facebook/orca/g/p;->b()V

    .line 46
    return-void
.end method
