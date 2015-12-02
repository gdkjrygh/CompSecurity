.class public Lcom/facebook/orca/contacts/picker/ad;
.super Ljava/lang/Object;
.source "ContactPickerGroupRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private final a:Lcom/facebook/orca/threads/ThreadSummary;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ad;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ad;->a:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method
