.class public Lroboguice/inject/NullProvider;
.super Ljava/lang/Object;
.source "NullProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    .local p0, "this":Lroboguice/inject/NullProvider;, "Lroboguice/inject/NullProvider<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 9
    .local p0, "this":Lroboguice/inject/NullProvider;, "Lroboguice/inject/NullProvider<TT;>;"
    const/4 v0, 0x0

    return-object v0
.end method
