.class public Lcom/facebook/prefs/shared/r;
.super Ljava/lang/Object;
.source "FbSharedPreferencesInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/j;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/prefs/shared/r;->a:Lcom/facebook/prefs/shared/j;

    .line 20
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/prefs/shared/r;->a:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/j;->d()V

    .line 26
    return-void
.end method
