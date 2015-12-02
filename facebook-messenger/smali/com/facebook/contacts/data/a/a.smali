.class public Lcom/facebook/contacts/data/a/a;
.super Ljava/lang/Object;
.source "CanMessageContactIndexBuilderFilter.java"

# interfaces
.implements Lcom/facebook/contacts/data/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/Contact;)Z
    .locals 1

    .prologue
    .line 11
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getCanMessage()Z

    move-result v0

    return v0
.end method
